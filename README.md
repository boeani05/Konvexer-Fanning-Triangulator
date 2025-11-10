# Convex Fanning Triangulator (Java)
## Projektbeschreibung
Dieses Projekt implementiert einen grundlegenden Algorithmus zur Fanning-Triangulation von konvexen 2D-Polygonen. Triangulation ist ein fundamentaler Schritt in der Computergrafik, um komplexe Formen in einfache Dreiecke zu zerlegen, die von Grafik-Hardware effizient gerendert werden können.
Der implementierte Algorithmus wählt einen Eckpunkt des Polygons als Referenzpunkt und bildet von dort aus Dreiecke mit allen benachbarten Eckpunktpaaren des Rests des Polygons.
## Motivation & Lernziele
Dieses Projekt entstand im Rahmen meiner Lernreise auf [roadmap.sh/game-developer](https://roadmap.sh/game-developer) und dient dazu, Kernkonzepte der Game Mathematics und Computer Graphics praktisch zu verstehen und umzusetzen.
Besonderer Fokus lag auf:
*   Verständnis der Fanning-Triangulationsmethode.
*   Implementierung einer speichereffizienten Datenstruktur, bei der Dreiecke durch Indizes statt direkter Punktobjekte referenziert werden. Dies ist ein Standardansatz in der Spieleentwicklung und Grafikprogrammierung, um die Performance zu optimieren und den Speicherverbrauch zu minimieren.
## Features
*   Implementierung des Fanning-Triangulationsalgorithmus.
*   Repräsentation von 2D-Punkten (`Vec2`).
*   Repräsentation von Polygonen als Liste von `Vec2`-Punkten.
*   Repräsentation von Dreiecken durch Indizes der Eckpunkte innerhalb der Polygon-Punktliste.
*   Konsolen-Ausgabe der triangulierten Dreiecke (als Indizes).
## Technologien
*   Java (Open JDK 17 oder höher)
## Wie man das Projekt ausführt
1.  **Repository klonen:**
    ```bash
    git clone https://github.com/boeani05/Konvexer-Fanning-Triangulator.git
    cd Konvexer-Fanning-Triangulator
    ```
2.  **Kompilieren (falls noch nicht geschehen, in einer IDE wie IntelliJ/Eclipse ist dies oft automatisch):**
    Navigiere zum `src` Verzeichnis oder dem Verzeichnis, wo deine `.java` Dateien liegen (z.B. `src/main/java`) und kompiliere die Dateien:
    ```bash
    javac Main.java Polygon.java Triangle.java Vec2.java
    ```
    *(Hinweis: Je nach Projektstruktur kann der `javac`-Befehl variieren. Wenn du eine IDE verwendest, ist dieser Schritt oft integriert.)*
3.  **Ausführen:**
    ```bash
    java Main
    ```
    Die `Main.java` enthält aktuell vordefinierte Punkte für ein Beispielpolygon. Die Ausgabe erfolgt auf der Konsole und zeigt die Indizes der Eckpunkte für jedes erzeugte Dreieck an.
## Beispielausgabe (für ein Sechseck)

(0, 1, 2) (0, 2, 3) (0, 3, 4) (0, 4, 5)

## Nächste Schritte (Potenzielle Erweiterungen)
*   Interaktive Eingabe von Polygonpunkten durch den Benutzer.
*   Validierung, ob das eingegebene Polygon tatsächlich konvex ist.
*   Implementierung anderer Triangulationsalgorithmen (z.B. Ear-Clipping für konkave Polygone).
*   Grafische Visualisierung der Triangulation (z.B. mit JavaFX oder Swing für 2D-Grafik).
*   Erweiterung auf 3D-Geometrie und das Einlesen von Modell-Dateien (z.B. `.obj`).
## Danksagung
Dieses Projekt wurde mit der Unterstützung und Anleitung von roadmap.sh als Teil meiner Reise zum Game Developer erstellt.
