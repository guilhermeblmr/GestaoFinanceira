# GestaoFinanceira

## Diagrama:


<div align="center">

``` Java
__________________       __________________       _________________________________
|      Gasto      |      |      Ganho      |      |           Relatorio            |
|_________________|      |_________________|      |________________________________|
| - tipo          |      | - tipo          |      |                                |
| - data          |      | - data          |----->|                                |
| - valor         |      | - valor         |      |                                |
| - formaPagamento|      |                 |      |                                |
|_________________|      |_________________|      | - gerarRelatorioDeGastos()     |
         |                                        | - gerarRelatorioDeGanhos()     |
         |                                        | - gerarRelatorioDeSaldoMensal()|
         +--------------------------------------->|________________________________|
```
  </div>
