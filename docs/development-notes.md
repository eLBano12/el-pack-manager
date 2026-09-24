# Development Notes

## Minecraft 26.3

Minecraft 26.1 and newer use unobfuscated game code, so this project will use the official Minecraft names rather than starting from an older Yarn-based codebase.

## Loader split

The project is intended to support both Fabric and NeoForge.

The split should stay simple:

- common: pack-management models, logic, and code that genuinely works on both loaders
- fabric: Fabric entry points and Fabric-specific client hooks
- neoforge: NeoForge entry points and NeoForge-specific client hooks

If a piece of code is identical on both loaders, it belongs in common.

If an API is loader-specific, keep that code in the corresponding loader module.

## Resource pack editor principle

Never edit an imported third-party pack in place.

Instead:

1. identify the source pack
2. create an eL personal override pack
3. store only the changed files in the override
4. place the override above the source pack
5. allow the player to export the override as its own pack

This protects the original pack and makes future updates safer.
