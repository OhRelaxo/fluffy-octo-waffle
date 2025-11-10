# Build Instructions

## Prerequisites

- Java 17 or higher
- Internet connection (access to maven.fabricmc.net required)
- Gradle 8.x or higher

## Building the Mod

### Option 1: Using Gradle Wrapper (Recommended)

First, generate the Gradle wrapper (requires internet access to maven.fabricmc.net):

```bash
gradle wrapper --gradle-version 8.8
```

Then build the mod:

```bash
./gradlew build
```

### Option 2: Using System Gradle

If you have Gradle installed system-wide:

```bash
gradle build
```

## Output

The compiled mod JAR file will be located at:
```
build/libs/nohunger-1.0.0.jar
```

## Troubleshooting

### maven.fabricmc.net Not Accessible

If you get errors about maven.fabricmc.net not being accessible:

1. Check your internet connection
2. Check if your firewall is blocking the domain
3. Try using a VPN if the domain is blocked in your region

### Java Version Issues

Make sure you're using Java 17 or higher:

```bash
java -version
```

If you need to install Java 17:
- On Ubuntu/Debian: `sudo apt install openjdk-17-jdk`
- On macOS: `brew install openjdk@17`
- On Windows: Download from [Adoptium](https://adoptium.net/)

## Testing the Mod

1. Install Minecraft 1.20.1
2. Install Fabric Loader 0.15.11+
3. Install Fabric API 0.92.2+
4. Copy the built JAR file to your `.minecraft/mods` folder
5. Launch Minecraft and check that hunger stays at maximum
