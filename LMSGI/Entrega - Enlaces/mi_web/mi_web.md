// VOLKOVA, YULIA

# Proyecto: Mi Web

## index.html

```html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Mi Web</title>
</head>
<body>
  <header>
    <h1>Mi Web</h1>
    <nav aria-label="Navegación principal">
      <a href="secciones/contacto.html">Contacto</a><br/>
      <a href="secciones/servicios.html">Servicios</a><br/>
      <hr>
      <a href="https://www.w3schools.com/" target="_blank" rel="noopener noreferrer">W3Schools</a><br/>
      <a href="https://chess-whisper.vercel.app/" target="_blank" rel="noopener noreferrer">chess-whispers</a><br/>
    </nav>
  </header>

  <main>
    <h2>Bienvenida</h2>
    <p>Conoce nuestra empresa y los servicios que ponemos a tu disposición.</p>

    <section aria-label="Imágenes destacadas">
      <h2>Imágenes</h2>
      <p>
        <a href="imagenes/logo.png" target="_blank">
          <img src="imagenes/logo.png" alt="Logo" style="width: 150px; height: auto;">
        </a>
      </p>
      <p>
        <a href="imagenes/banner.jpg" target="_blank">
          <img src="imagenes/banner.jpg" alt="Banner" style="width: 400px; height: auto;">
        </a>
      </p>
    </section>

    <p><a href="#info">Ir a más información</a></p>

    <section id="info">
      <h2>Más información</h2>
      <p>Ofrecemos soluciones adaptadas a cada cliente, con atención personalizada y un equipo profesional.</p>
    </section>
  </main>
</body>
</html>
```

## secciones/contacto.html

```html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contacto | Mi Web</title>
</head>
<body>
  <h1>Contacto</h1>
  <p>Estamos disponibles para resolver tus dudas y atender tus consultas.</p>

  <nav aria-label="Navegación de contacto">
    <a href="../index.html">Volver a la página principal</a>
    <a href="formulario.html">Enviar tus datos</a>
  </nav>
</body>
</html>
```

## secciones/servicios.html

```html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Servicios | Mi Web</title>
</head>
<body>
  <h1>Servicios</h1>

  <section>
    <h2>Consultoría personalizada</h2>
    <p>Analizamos las necesidades de cada cliente para proponer la mejor solución.</p>

    <h2>Diseño web</h2>
    <p>Creamos páginas web claras, atractivas y adaptadas a dispositivos móviles.</p>

    <h2>Soporte técnico</h2>
    <p>Ofrecemos ayuda y mantenimiento para que tus servicios funcionen correctamente.</p>
  </section>

  <nav aria-label="Navegación de servicios">
    <a href="../index.html">Volver a la página principal</a>
    <a href="formulario.html">Ir al formulario</a>
    <a href="contacto.html">Contacto</a>
  </nav>
</body>
</html>
```

## secciones/formulario.html

```html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulario | Mi Web</title>
</head>
<body>
  <h1>Formulario</h1>
  <p>Utiliza esta página para enviar tus datos de contacto.</p>

  <nav aria-label="Navegación del formulario">
    <a href="contacto.html">Volver a contacto</a>
    <a href="servicios.html">Ver servicios</a>
  </nav>
</body>
</html>
```
