# cloud-parking


## Run database usando Doker
doker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 - d postgres:10-alpine

### Esse projeto rodou database PostgresSQL usado na porpria maquina configurado diretamente no InteliJ