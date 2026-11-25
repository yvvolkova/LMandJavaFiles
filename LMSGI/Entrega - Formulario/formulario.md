```html
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>

<body>

    <form>

        <h2>Texto</h2>

        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre">

        <h2>Radio Button</h2>

        <input type="radio" id="male" name="genero" value="male" checked>
        <label for="male">Male</label>
        <br>

        <input type="radio" id="female" name="genero" value="female">
        <label for="female">Female</label>
        <br>

        <input type="radio" id="other" name="genero" value="other">
        <label for="other">Other</label>

        <h2>Selector de opciones</h2>

        <label for="coche">Marca de coche:</label>
        <select id="coche" name="coche">
            <option value="volvo">Volvo</option>
            <option value="audi">Audi</option>
            <option value="bmw">BMW</option>
            <option value="mercedes">Mercedes</option>
        </select>

        <h2>Área de Texto</h2>

        <textarea name="texto" rows="10" cols="80">Texto inicial dentro del campo</textarea>

        <h2>Contraseña</h2>

        <label for="keyword">Keyword:</label>
        <input type="password" id="keyword" name="keyword">

        <h2>Checkbox</h2>

        <p>Elige cuál es tu vehículo</p>

        <input type="checkbox" id="bici" name="vehiculo" value="bici">
        <label for="bici">Tengo una bici</label>
        <br>s

        <input type="checkbox" id="coche-checkbox" name="vehiculo" value="coche" checked>
        <label for="coche-checkbox">Tengo un coche</label>
        <br>

        <input type="checkbox" id="moto" name="vehiculo" value="moto" checked>
        <label for="moto">Tengo una moto</label>

        <h2>Subida de archivo</h2>

        <label for="archivo">Selecciona el/los archivo/s a subir:</label>
        <input type="file" id="archivo" name="archivo" multiple>

        <br><br>

        <input type="submit" value="Enviar el formulario">

    </form>

</body>
</html>
```