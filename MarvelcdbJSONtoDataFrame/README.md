# MarvelcdbJSONtoDataFrame
Script para obtener las cartas de la API de marvelcdb.com (/api/public/cards) y guardarlas en base de datos MySQL
Como los datos vienen en formato JSON el script obtiene los datos de la API, los transforma a DataFrame y los carga en la BBDD marvelchampionsdigital de MySQL 

## Requisitos
- Mysql, Pyton y Pip
- Schema marvelchampionsdigital creado en localhost MySQL
- Librerias necesarias: requests, json, pandas, sqlalchemy, openpyxl y pymysql
```bash
$ pip install requests json pandas sqlalchemy openpyxl pymysql
```

## Ejecutar
- Lanzamos script MarvelcdbJSONtoDataFrame.py
```bash
$ python MarvelcdbJSONtoDataFrame.py
```