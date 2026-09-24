# eL Pack Manager

eL Pack Manager is a client-side Minecraft utility for managing, customizing, and switching resource packs and data packs without leaving the game.

## Defining feature

**Manage, customize, and switch your Minecraft packs without leaving the game.**

The mod combines pack management with named setups, per-world configurations, safety tools, and a basic resource pack editor.

## Development

Current target: **Minecraft 26.3**

Supported loaders:
- Fabric
- NeoForge

Current development version: **0.1.0**

Pre-1.0 versions are development builds. The first intended player-testing release is **1.0.0**.

## Planned 1.0 features

- Resource pack management
- Data pack management
- Named pack profiles
- Per-world pack setups
- Pack library
- Search and filtering
- Missing-pack detection
- Pack metadata and compatibility information
- Dependency, recommendation, and conflict information
- Backup-before-change safety
- Pack history and safe recovery where Minecraft allows it
- Import and export
- Resource pack previews
- Temporary preview mode
- Creator/testing tools
- Safe data pack application
- Basic resource pack editor from the main menu

## Resource Pack Editor

The editor is intentionally focused rather than trying to replace a full authoring program.

It will let players create a **personal override pack** above an existing resource pack. The original pack is never modified.

Initial editor scope:
- Browse pack assets
- Replace textures
- Edit basic pack metadata
- Change pack name, description, and icon
- Preview textures
- Enable or disable individual overrides
- Restore an override
- Save changes into a separate personal override pack
- Export the customized pack

More advanced model, animation, font, sound, and JSON editing can be considered after the core editor is stable.

## Development philosophy

The project is being built in small, understandable steps.

The code should stay:
- straightforward
- maintainable
- clearly named
- lightly abstracted
- loader-specific only where necessary

Shared code belongs in the common layer when it is genuinely shared. Fabric and NeoForge implementations should remain thin.

## Version plan

| Version | Focus |
| --- | --- |
| 0.1.0 | Foundation and main Pack Manager screen |
| 0.2.0 | Resource pack library |
| 0.3.0 | Data pack library |
| 0.4.0 | Profiles |
| 0.5.0 | Per-world Pack Setups |
| 0.6.0 | Safety, backups, and recovery |
| 0.7.0 | Search, filtering, metadata, compatibility |
| 0.8.0 | Resource Pack Editor |
| 0.9.0 | Import/export, history, polish, and integration |
| 1.0.0 | First public release |

## License

License will be added before the first public release.
