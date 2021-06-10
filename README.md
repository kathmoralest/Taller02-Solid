# Taller03-Solid
4. Enum Adicionales.Aderezo
  El principio que se atenta es DIP, ya que inicialmente se depende de detalles y no de la abstracción, cambiando enum a una clase abstracta reducimos el aclopamiento.
  Antes
  ![image](https://user-images.githubusercontent.com/8119854/121571127-3d1f7700-c9e8-11eb-935c-339c36b67080.png)
  Después
  ![image](https://user-images.githubusercontent.com/8119854/121572395-c08d9800-c9e9-11eb-98ca-70acf7a3eabc.png)

5. Clase manejadorDeLeche: El principio que no se cumple es LSP puesto que la clase hija LecheDeslactosada tiene un comportamiento inesperado a la clase padre LecheEntera al tirar una excepción
![2021-06-10](https://user-images.githubusercontent.com/73547550/121575676-40693180-c9ed-11eb-83eb-acc6c9648982.png)
![2021-06-10 (1)](https://user-images.githubusercontent.com/73547550/121575700-4828d600-c9ed-11eb-9e93-82c195390645.png)
