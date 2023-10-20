import pandas as pd
from sqlalchemy import create_engine

# Convertir el array de JSON en un DataFrame
df = pd.read_json('cards.json')

# Convertir todas las columnas a tipo de dato str
df = df.astype(str)

# Imprimir el DataFrame por consola
print(df)
print(df.columns)

# Guardar el DataFrame en un fichero Excel
#df.to_excel('cards.xlsx', sheet_name='Cartas Marvel Champions', index=False)

# Conectar a la base de datos MySQL
engine = create_engine('mysql+pymysql://root:mysql@localhost/marvelchampionsdigital')

# Almacenar el DataFrame en una tabla llamada 'cartas'
df.to_sql('cartas', con=engine, if_exists='replace', index=False)