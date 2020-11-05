# Spring Cloud Client 
    Serviço reponsavel de criar uma lista de clientes com valores
# Ends Points

    GET http://${URL}:8762/client/{lines}
   
   Parametro | Descrição | Tipo 
   --- | --- | --- 
   Line | Obrgatório:  | Long   
Esse End-pont retorna uma lista de clientes 

Exemplo de resultado:
```json
[
  {
    "name": "of6czwWao6",
    "value": 40999761673699,
    "date": "2020-11-11",
    "quantityOfItems": 40999761772335
  },
  {
    "name": "PzK9Z5gxsf",
    "value": 40999761981150,
    "date": "2020-11-11",
    "quantityOfItems": 40999762071968
  },
  {
    "name": "XkGxFDMVRY",
    "value": 40999762272306,
    "date": "2020-11-11",
    "quantityOfItems": 40999762361749
  },
  {
    "name": "n6VyJd9OEw",
    "value": 40999762560528,
    "date": "2020-11-11",
    "quantityOfItems": 40999762650773
  },
  {
    "name": "_tISM2onsV",
    "value": 40999762847686,
    "date": "2020-11-11",
    "quantityOfItems": 40999762936374
  },
  {
    "name": "iKgmGr9FX1",
    "value": 40999763133277,
    "date": "2020-11-11",
    "quantityOfItems": 40999763223008
  },
  {
    "name": "bGQQ6XYdMq",
    "value": 40999763420101,
    "date": "2020-11-11",
    "quantityOfItems": 40999763509809
  },
  {
    "name": "KHCrwtb7xL",
    "value": 40999763707831,
    "date": "2020-11-11",
    "quantityOfItems": 40999763798145
  },
  {
    "name": "LwFXRzYX7k",
    "value": 40999763996494,
    "date": "2020-11-11",
    "quantityOfItems": 40999764085821
  },
  {
    "name": "qOyHb0TTtv",
    "value": 40999764296313,
    "date": "2020-11-11",
    "quantityOfItems": 40999764378702
  }
]
   ```