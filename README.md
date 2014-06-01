A simple DSL built in xText called drewIO that demonstrates xText language, some eclipse plugin concepts and a Zest based ViewPart (and standalone viewer) for visualizing a drewIO language model.


Example:
input Input1 { type ( Col integer ) ; } 
input Input2 { type ( Col integer ) ; }
input Input3 { type ( Col integer ) ; } 
input Input4 { type ( Col integer ) ; }

output Output1 receives Input1 { } 
output Output2 receives Input1 { } 
output Output3 receives Input1 { } 
output Output4 receives Input1, Input2, Input3 { }
