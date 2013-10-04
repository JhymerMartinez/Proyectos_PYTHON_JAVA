#encoding:utf-8

import time
inicio = time.time()
#------------------------------------------------------
##################  EJECRCICIO 4 ######################
"""valor = int(input("Digite un número: "))

for i in range(1,valor+1):    
    aux = 3 * i
    if aux <= valor:
        print("3 X "+ str(i) +" = " + str(aux))"""

##################  EJERCICIO 5  ######################
"""
i = 1
suma = 0
multiplicacion = 1

while i <= 10:
    valor = int(input("Digite el valor N°"+ str(i) +" : "))
    if valor > 0:
        suma = suma + valor
    else:
        multiplicacion = multiplicacion * valor
        
    i = i+1

print("Suma= "+str(suma))
print("Multiplic. = "+ str(multiplicacion))   
"""
##################3 EJERCICIO 6  ########################



#------------------------------------------------------

class Empleado:
    nombre = ""
    peso = 0

"""def __init__(self,nombre,peso):
        self.nombre = nombre
        self.peso = peso"""
lista = []
lista_mayor = []
lista_menor = []

limite = int(raw_input("Cantidad de empleados a ingresar: "))
for i in range(1,limite+1):
    empleado = Empleado()    
    
    empleado.nombre = str(raw_input("Ingrese el nombre de empleado N°"+str(i)+": ")) 
    empleado.peso = int(raw_input("Ingrese el Peso: "))

    lista.append(empleado)

for i in range(0,len(lista)):
    if lista[i].peso > 80:
        lista_mayor.append(lista[i])
    else:
        lista_menor.append(lista[i])

print("\nLISTA DE EMPLEADOR CON PESO MAYOR A 80 ")
for e in lista_mayor:
    print(e.nombre)
    
print("\nLISTA DE EMPLEADOR CON PESO MENOR A 80 ")
for e in lista_menor:
    print(e.nombre)
    

#---------------------------------------

print("\nTiempo total: "+ str(time.time()-inicio) + " milisegundos")
        