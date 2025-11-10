# No Hunger Mod

Ein Minecraft Fabric Mod, der die Hunger-Mechanik deaktiviert und Spielern erlaubt, ohne Sorgen um Nahrung zu spielen.

_A Minecraft Fabric mod that disables the hunger mechanic, allowing players to play without worrying about food._

## Features / Funktionen

- Keeps hunger level at maximum (20) / Hält den Hunger-Level auf Maximum (20)
- Maintains saturation at maximum (5.0) / Hält die Sättigung auf Maximum (5.0)
- Prevents hunger from decreasing / Verhindert, dass Hunger abnimmt
- No need to eat food in the game / Keine Notwendigkeit, Nahrung zu essen

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/)
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. Download the mod JAR file
4. Place the JAR file in your `.minecraft/mods` folder

## Building / Bauen

See [BUILD.md](BUILD.md) for detailed build instructions.

**Note**: Building this mod requires internet access to `maven.fabricmc.net`. The build process will download the necessary Fabric dependencies.

To build:

```bash
gradle wrapper --gradle-version 8.8
./gradlew build
```

The built JAR file will be located in `build/libs/`.

## How It Works / Wie es funktioniert

See [TECHNICAL.md](TECHNICAL.md) for technical details about how the mod works.

The mod uses a Mixin to intercept Minecraft's hunger update system and keeps the hunger bar full at all times.

## Compatibility / Kompatibilität

- Minecraft Version: 1.20.1
- Fabric Loader: 0.15.11+
- Fabric API: 0.92.2+
- Java: 17+

## License / Lizenz

This project is licensed under the MIT License - see the LICENSE file for details.