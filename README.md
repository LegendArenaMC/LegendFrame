LegendFrame
====

The successor to KotlinLoader. Requirement for all LegendArena plugins.

Getting a Jar
====

```bash
$ ./build.sh
```

The built jar should be in the build/libs folder.

Usage for Developers
====

In your plugin.yml, place the following line:

```yaml
depends: [LegendFrame]
```

Usage for Server Owners
====

Place the built .jar in your plugins folder and enjoy.

POSSIBLE CONFLICTS
====

* BarAPI
* Any plugins that adds the Kotlin runtime
* GSON-containing plugins
* Apache Commons IO-containing plugins