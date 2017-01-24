package com.frantz.samples2.codegen;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Oldcache {

	Map<String, String> HASH_COLLECTION = new HashMap<String, String>();
	Map<String, String> temp = new HashMap<String, String>();

	AtomicBoolean update_cache = new AtomicBoolean(false);
	AtomicBoolean update_coll = new AtomicBoolean(false);

	public void doCache(int cnt) {
		if (!update_cache.compareAndSet(false, true)) {
			return;
		}
		temp.clear();
		for (int i = 0; i < cnt; ++i) {
			temp.put("Key_" + i, "Value_" + i);
		}
		update_coll.set(true);
		HASH_COLLECTION.clear();
		HASH_COLLECTION.putAll(temp);
		update_coll.set(false);
		temp.clear();

		update_cache.set(false);
	}

	private void waitOnColl() {
		while (update_coll.get())
			;
	}

	public String get(String key) {
		waitOnColl();
		return HASH_COLLECTION.get(key);
	}

	public static void main(String[] args) {

	}

}
