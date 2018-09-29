##No de mi propiedad##

He aquí un caso de prueba que revienta el algoritmo de recorrer ordenado  sumando pilas a medida que no se puede apilar:

2 1
3 1
2 2
12 1
7 2
5 4
9 3

ordenado de menor a mayor por largo quedaría:

2 1 
2 2
--------------------
3 1
5 4
--------------------
7 2
9 3
---------------
12 1

4 pilas ----> INCORRECTO
Forma correcta de resolverlo (por lo menos hasta que la revienten con algún caso de prueba)
El orden para recorrerlas puede ser por mayor largo o por mayor superficie, en los casos planteados ambos criterios funcionaron.
Elegir las mesadas que no se pueden apilar sobre otras, y comenzar por cualquiera de estas, por ejemplo 12 1 y apilar sobre esta las que sean posibles, cuando no se puede hacer una nueva pila. 
 
 2  1     2 2
 3  1     7 2
 12 1     9 3    5 4  