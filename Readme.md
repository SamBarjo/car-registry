# Projet pour le lab hibernate

## Démarrer le projet

```bash
mvn clean install
mvn exec:java
```

## API

Le projet est un API REST qui contient 2 endpoints : 

* GET /owners pour obtenir la liste des propriétaires d'automobiles avec leurs automobiles
* POST /owners/{id}/cars pour ajouter un nouvel automobile avec une certaine plaque `{ "carPlate": "H0H0H0" }` (utiliser ce JSON comme body)

## Persistence

La branche master contient le code de base avec une persistence en mémoire. La branche solution remplace celle-ci par une persistence hibernate.