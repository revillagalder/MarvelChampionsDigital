import requests
import json
import pandas as pd
from sqlalchemy import create_engine

# Hacer una solicitud a la API
url = 'https://marvelcdb.com/api/public/cards/core' 
response = requests.get(url)

# Verificar si la solicitud fue exitosa (código de estado 200)
if response.status_code == 200:
    # Convertir la respuesta a JSON
    datos_json = response.json()

    # Guardar los datos en un archivo JSON
    with open('cards_core.json', 'w') as archivo_json:
        json.dump(datos_json, archivo_json)

    print("Los datos de core han sido guardados correctamente en 'cards_core.json'.")

    # Convertir el array de JSON en un DataFrame
    df = pd.DataFrame(datos_json)

    # Convertir todas las columnas a tipo de dato str
    df = df.astype(str)

    # Guardar el DataFrame en un fichero Excel
    # df.to_excel('cards.xlsx', sheet_name='Cartas Marvel Champions', index=False)

    # Conectar a la base de datos MySQL
    engine = create_engine('mysql+pymysql://root:mysql@localhost/marvelchampionsdigital')

    # Almacenar el DataFrame en una tabla llamada 'cartas'
    df.to_sql('cartas', con=engine, if_exists='replace', index=False)

    print("Datos almacenados correctamente en MySQL marvelchampionsdigital.cards.")

else:
    print(f"No se pudo completar la solicitud. Código de estado: {response.status_code}")