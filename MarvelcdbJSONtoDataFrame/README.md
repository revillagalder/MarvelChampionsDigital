# MarvelcdbJSONtoDataFrame
Script en Python para alimentar la BBDD MySQL a partir de los datos obtenidos de la API de marvelcdb.com
Como los datos vienen en formato JSON y queremos almacenarlos en una BBDD relacional convertimos los datos a DataFrame y los cargamos en MySQL.

## Requisitos
- Instalar pyton y pip
- Instalar librerias necesarias
```bash
$ pip install pandas sqlalchemy openpyxl pymysql
```

## Importar cartas JSON a BBDD
- Obtenemos el json de todas las cartas haciendo uso de la api de marvelcdb (/api/public/cards)
- Con SoapUI hacemos un GET de las cartas y exportamos el resultado a un fichero cards.JSON
- Lanzamos python MarvelcdbJSONtoDataFrame.py para generar los datos a importar a la BBDD
```bash
$ paython MarvelcdbJSONtoDataFrame.py
```