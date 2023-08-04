#language:es

Característica: Busqueda de un libro
  Yo como usuario quiero buscar un libro, para agregarlo al carrito de compra.

  @smokeTest @busquedaExitosa
  Escenario: Busqueda del libro exitosa.
    Dado que el usuario abre la pagina de la libreria nacional
    Cuando el usuario busca el libro
    Y de clic sobre el nombre del libro
    Y ingrese la cantidad de libro ha agregar
    Y de clic en añadir al carrito
    Entonces el usuario podrá observar el mensaje de confirmacion.


