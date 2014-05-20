var importedNames = JavaImporter();
importedNames.importPackage(Packages.com.frantz.drewio.drewIO);

with(importedNames)
{


	function countElements(cont)
	{
		if(cont==null) return;
		output.print("Statements    = " + cont.getStatements().size() );
		it1 = cont.getStatements().iterator();
		while(it1.hasNext())
		{
			s= it1.next();
			if(s instanceof Statement)
			{
				output.print(s.getName());
			}
			
		}
	}
	// Main
 	output.print("Hello");
	countElements(model); // this is passed in from the script invoker

}