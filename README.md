LegendFrame
====

The successor to my old plugin, KotlinLoader.

Getting a Jar
====

```bash
$ ./build.sh
```

The built jar should be in the build/libs folder.

If you're building on Windows... tough luck. I don't support building on Windows personally.
(it can be done, I just don't recommend it - at least use Git Bash or Cygwin. they let you use the build.sh script.)

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

* Any plugins that adds the Kotlin runtime
* GSON-containing plugins
* Apache Commons IO-containing plugins
