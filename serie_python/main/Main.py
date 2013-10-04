#encoding:utf-8

limite = int(raw_input("Ingrese el limite: "))        
multiplic = 1.0
aux=0.0
contador = 1.0
numero = 2.0
divisor = 2.0

while contador <= (limite-1):
    if (numero % divisor) == 0:
        if numero == divisor:
            for i in range(1,int(contador+1)):
                multiplic = multiplic * i
            if contador == 1:
                print str(numero-1) + "^("+str(contador)+"/"+str(multiplic)+"), " ,              
            multiplic = 1
            for i in range(1,int(contador+2)):
                multiplic = multiplic * i
                                       
            print str(numero)+ "^("+str(contador+1)+"/"+str(multiplic)+"), " ,
            if contador == 1:
                aux = aux + pow(numero-1,(float(contador)/float(multiplic)))   
            aux = aux + pow(numero,(float(contador+1)/float(multiplic)))
            contador = contador + 1
        divisor = 2
        numero = numero + 1
    else:
        divisor= divisor + 1
print ("Suma = %.5f" %(aux))     
        
        
