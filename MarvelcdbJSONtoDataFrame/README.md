# Requisitos
- Instalar pyton y pip
- pip install pandas sqlalchemy openpyxl pymysql

# Importar cartas JSON a BBDD
- Obtenemos el json de todas las cartas haciendo uso de la api de marvelcdb (/api/public/cards)
- Con SoapUI hacemos un GET de las cartas y exportamos el resultado a un fichero cards.JSON
- Lanzamos python MarvelcdbJSONtoDataFrame.py para generar los datos a importar a la BBDD
