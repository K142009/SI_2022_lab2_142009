# SI_2022_lab2_142009
Катерина Калајџиевска 142009

2. Control Flow Graph:

![Lab2 Control Flow Graph (1)](https://user-images.githubusercontent.com/71216158/171938702-2db38172-ef8c-47a6-ba4f-75fe319fce04.jpg)

3. Цикломатската комплексност на кодот е 9. До оваа бројка стигнав така што изброив 8 предикатни јазли и според формулата (Cyclomatic complexity = P + 1) додадов уште еден. Овој резултат го потврдив така што изброив иста бројка на региони во графот ( 9 ) и на крај изброив 20 јазли и 27 рабови, па според последната формула Cyclomatic complexity = Е – Н + 2, добив СС = 27 – 20 + 2 = 9.

4. Every Statement 

![Every statement table](https://user-images.githubusercontent.com/71216158/171940407-65d60def-f363-4a4f-93c3-3f6aff2c8d3f.jpg)

Според Every statement критериумот дадениот код можеме да го поминиме со 3 тест случаи. Првиот случај е кога на влез даваме празна листа (NULL), а очекуваниот резултат од кодот е да фрли исклучок (јазол B). Вториот тест случај е кога на влез даваме листа чиј број на елементи не е соодветен и повторно очекуваниот резултат од кодот е да фрли исклучок (јазол D). Со последниот тест случај очекуваме кодот да ги помине првите две проверки за влезот и да влезе во for циклусот каде благодарение на добро избраните елементи на низата ќе ги измине сите линии код во for циклусот, ќе излезе од циклусот и ќе ја изврши последната линија од функцијата, односно return линијата. 


5. Every Branch

![EVERY BRANCH](https://user-images.githubusercontent.com/71216158/171948832-45ea1e2d-76b6-40b1-8755-a2424469b8b9.jpg)
