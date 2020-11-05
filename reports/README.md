# Spring Cloud Report
    Serviço reponsavel de persistir no banco os clientes e gera alguns relatórios 
# Ends Points

    POST http://${URL}:8763/report/
   
Parametro | Descrição | Tipo 
---       |   ---     | --- 
ClientDTO      | Obrgatório: enviar por request Body  | {String name, Long value,LocalDate date,Long quantityOfItems}   
End-pont persiste no banco de dados a lista de clientes


    GET http://${URL}:8763/report/reportByValue
   
   
Esse End-pont retornar uma lista contendo clientes com a soma total do VALOR.

Exemplo de resultado:
```
    {
        "name": "BlKgxnpYbn",
        "value": 205087092422521
    },
   ```

    GET http://${URL}:8763/report/reportByDate
   
   
Esse End-pont retornar a lista com a soma total do VALOR gasto pelo Data.

Exemplo de resultado:
```
   {
        "date": "2020-11-11",
        "sumQuantityOfItems": 4125575132750827
    },
   ```