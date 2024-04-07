# Ćwiczenia 

## Zadanie 1 ( branch - zad1)
Utwórz klasę Point, która będzie reprezentować punkt na płaszczyźnie oraz:
- punkt jest zdefiniowany przez pola x i y, typu double,
- pola te są prywatne,
- ma publiczną metodę getX, zwracającą wartość pola x,
- ma publiczną metodę getY, zwracającą wartość pola y,
- ma publiczną metodę setX, ustawiającą wartość pola x,
- ma publiczną metodę setX, ustawiającą wartość pola y,
- konstruktor inicjujący te pola.
  
Następnie w klasie Main utwórz obiekt klasy Point, zainicjuj go wartościami i wyświetl jego
współrzędne w terminalu.

## Zadanie 2 ( branch – zad2)
Utwórz pakiet geometry do którego przenieś i dodaj wymagany kod, plik Point. Następnie,
utwórz klasę Circle, która będzie reprezentować koło, oraz:
- koło jest zdefiniowanie przez pola center (punkt) i radius,
- pola te są prywatne,
- ma publiczną metodę getCenter, zwracającą wartość center,
- ma publiczną metodę getRadius, zwracającą wartość radius,
- ma publiczną metodę calculatePerimeter, zwracającą wartość obwodu koła,
- ma publiczną metodę getArea, zwracającą wartość pola powierzchni koła.
- wykorzystaj klasę Point jako część definicji koła.

Następnie w klasie Main utwórz obiekt klasy Circle, zainicjuj go wartościami i wyświetl jego
właściwości.

## Zadanie 3 ( branch – zad3)
Utwórz w pakiecie geometry klasę ColoredCircle, która dziedziczy po klasie Circle oraz:
- ma pole color, reprezentujące kolor koła.
- pole to jest prywatne,
- ma publiczną metodę getColor, zwracającą wartość color.
Następnie w klasie Main utwórz obiekt klasy ColoredCircle, zainicjuj go wartościami i wyświetl
jego właściwości.

## Zadanie 4 ( branch – zad4)
Utwórz tablicę obiektów typu Circle oraz ColoredCircle a następnie, przeiteruj tę tablicę,
wywołując dla każdej iteracji metodę calculateArea() dla każdego obiektu. Sprawdź, czy metoda jest
poprawnie wywoływana dla obiektów obu tych klas.
Dodatkowo, jeżeli element tablicy jest instancją ColoredCircle, wywołaj metodę getColor().

## Zadanie 5 ( branch – zad5)
Utwórz w pakiecie geometry klasę Rectangle, która będzie reprezentować prostokąt oraz:
- prostokąt jest zdefiniowany przez pole length, reprezentujący długość oraz width,
reprezentujący szerokość,
- ma publiczną metodę calculateArea(), zwracającą pole prostokąta,
- ma publiczną metodę calculatePerimeter(), zwracającą obwód prostokąta.

Następnie w klasie Main utwórz obiekt klasy Rectangle, zainicjuj go wartościami i wyświetl jego
właściwości.

## Zadanie 6 ( branch – zad6)

Utwórz klasę Square w pakiecie geometry, która będzie reprezentować kwadrat. Klasa ta,
dziedziczy po klasie Rectangle. Klasa Square, powinna zawierać jedynie konstruktor, który będzie
przekazywał długość boku do konstruktora klasy bazowej Rectangle.
Następnie w klasie Main utwórz obiekt klasy Square, zainicjuj go wartościami i wyświetl jego
właściwości.
