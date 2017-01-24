package com.frantz.tools;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class DoubleBufferCache
{
	 static Map<String, String> HASH_COLLECTION1=new HashMap<String, String>();
	 static Map<String, String> HASH_COLLECTION2=new HashMap<String, String>();
	 	
	 static AtomicReference<Map<String, String>> m_coll= new  AtomicReference<Map<String, String>>();
	 static AtomicBoolean updating_cache= new AtomicBoolean(false);
	 static AtomicBoolean buffer_is_first= new AtomicBoolean(true);
	 
	 static
	 {
		 m_coll.set(HASH_COLLECTION2);
	 }
	static public void cacheData(int cnt)
	{
		if(!updating_cache.compareAndSet(false, true))
		{
			return;
		}
		boolean b = buffer_is_first.get() ;
		Map<String, String> temp = b ? HASH_COLLECTION1 : HASH_COLLECTION2;
		for(int x=0;x<cnt;++x)
		{
			temp.put("Item_"+x, "Value"+x);
		}
		updateCache(temp);
		buffer_is_first.set(!b);
		
		updating_cache.set(false);
		
		
	}
	
	static private void updateCache(Map<String, String> newColl)
	{
		Map<String, String> last = m_coll.getAndSet(newColl);
		last.clear();

	}
	public static String get(String id)
	{
		return m_coll.get().get(id);
	}
	
	public static Collection<String> getAll()
	{
		return new TreeSet<String>(m_coll.get().values());
	}

}
