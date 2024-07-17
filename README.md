Bootcamp Santander Dev Week 2024

```mermaid
classDiagram
  class Banco {
    <<Entity>>
    +int id
    +string name
    +string dataInicio
    +string dataFim
    +int xp_Count
    -Curso[] cursosConcluidos
    -Curso[] cursosPendentes
  }
  
  class Curso {
    <<Entity>>
    +int id
    +string nameCurso
    +int carga
  }
  
  Banco -- Curso : possui >
```
