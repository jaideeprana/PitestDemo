# PitestDemo

Provides a quick demo of the Mutation testing tool for Java called Pitest.

## Installation

Add `id 'info.solidsoft.pitest' version '1.5.1'` in build.gradle under plugins at the top of the file.

So that it will look something like this:

```groovy
plugins {
    id 'java'
    id 'info.solidsoft.pitest' version '1.5.1'
}
```

Similarly at the bottom add the following to add junit5 support for pitest.
This is required because there's no out of the box support for junit 5.

```groovy
pitest {
    junit5PluginVersion = '0.12'
}
```

## For more info visit the following links

- [Official pitest doc](https://pitest.org/)
- [Weak tests, that get missed in typical coverage report](https://pitest.org/weak_tests/)

## Comparison of various mutation testing systems for Java

- [Java mutation testing systems compared](https://pitest.org/java_mutation_testing_systems/)

## Run mutation testing via Pitest

```sh
./gradlew pitest
```

## Mutation testing report

Report can be seen at `${Project_dir}/build/reports/pitest/${timestamp}/index.html`

## Few things to be mindful of

Ensure that the path you have specified in build.gradle in group matches the one the one you have for the source files.
Failing to ensure that will cause pitest to fail complaining no mutations found. This makes sense because it's unable to find any files in the given path.

At the time of creating this example `1.5.1` was the latest version of pitest, please check if newer version is available.

## Todo

- [ ] Add config to define a threshold for the pitest coverage. That way if there's low pitest coverage then the build will fail.
