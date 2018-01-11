Feature:Adding Test

  Scenario Outline:Test Add
     Given i input <arg1>  and <arg2>
     When the calculator is run
     Then the put should be  <totle>totle
Examples:

| arg1 | arg2 | totle |
|  2  |  3   |5    |
|  1   |  1   |2    |
|  3   |  4   |7    |
