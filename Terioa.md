# java 
## caracateristicas de java
 - portable 
 - facil 
 - segura 
 - omnipresente

## Maquina Virtual de Java (JVM)
ejecutar el codigo independientemente del sistema operativo

 - codigo (lenguaje) - lenguaje Java
 - ejecutable (lenguaje) - bytecode
 - Java Virtual Machine (JVM)
  - garbage colector administra la memoria 
  - multiplataforma
  - seguridad
  - optimizacion
  - librerias

### ejecutables de Windows (.exe) 
Los ejecutables de Windows pueden correr directamente en el sistema operativo, los de Java necesitan de la máquina virtual

### archivos ejecutables de Java (Bytecode)
    Ya hemos hablado que Bytecode es un código de máquina similar a Assembly. Tal vez encontraste extraño el nombre Bytecode (yo también), sin embargo, tiene una explicación muy simple: existe un conjunto de comandos que la máquina virtual de Java entiende, esos comandos son también llamados opcodes (operation code) y cada opcode posee exactamente 1 Byte de tamaño. Entonces, tenemos un opcode de 1 Byte, o más simple, Bytecode.

    Los archivos ejecutables de Java son portátiles, los de Windows no

```
El JDK es el ambiente para ejecutar aplicaciones Java y además posee varias herramientas de desarrollo
    JDK = JRE + Herramientas de desarrollo

EL JRE es el ambiente para ejecutar una aplicación Java
    JRE = JVM + Librerías
```

 - TIPO     TAMAÑO
 - boolean  1 bit
 - byte     1 byte
 - short    2 bytes
 - char     2 bytes
 - int      4 bytes
 - float    4 bytes
 - long     8 bytes
 - double   8 bytes