# How the No Hunger Mod Works

## Overview

This Minecraft Fabric mod disables the hunger mechanic by preventing the hunger bar from decreasing. The player will always have full hunger and saturation levels.

## Technical Implementation

### Mixin System

The mod uses the Fabric Mixin system to modify Minecraft's behavior at runtime without changing the base game files.

### Key Component: HungerManagerMixin

The core of the mod is the `HungerManagerMixin` class, which injects into Minecraft's `HungerManager.update()` method:

```java
@Inject(method = "update", at = @At("HEAD"), cancellable = true)
private void onUpdate(CallbackInfo ci) {
    // Keep hunger at maximum
    // Cancel normal hunger updates
}
```

### What It Does

1. **Intercepts Updates**: The mixin intercepts the `update` method of `HungerManager` which is called every game tick
2. **Sets Maximum Values**: It ensures the food level is always 20 (full) and saturation is always 5.0 (maximum)
3. **Cancels Normal Behavior**: It prevents the normal hunger decrease by canceling the update method

### Effects in Game

- Hunger bar stays full at all times
- Player never needs to eat food
- Player health regenerates without consuming hunger
- Sprint and jump actions don't consume hunger
- Food can still be eaten but has no effect on hunger levels

## File Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── nohunger/
│   │           ├── NoHungerMod.java          # Main mod initialization
│   │           └── mixin/
│   │               └── HungerManagerMixin.java  # Hunger modification logic
│   └── resources/
│       ├── fabric.mod.json                  # Mod metadata
│       └── nohunger.mixins.json            # Mixin configuration
```

## Compatibility

- **Minecraft Version**: 1.20.1
- **Loader**: Fabric Loader 0.15.11+
- **API**: Fabric API 0.92.2+
- **Java Version**: 17+

## Potential Conflicts

This mod may conflict with:
- Other mods that modify hunger mechanics
- Mods that add new food systems
- Some survival/hardcore mods

## Customization

To modify the behavior, you can edit `HungerManagerMixin.java`:

- Change the food level target (currently 20)
- Change the saturation target (currently 5.0)
- Add conditional logic (e.g., only work in certain game modes)
- Add configuration options using Fabric's config system
