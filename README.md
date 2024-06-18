# Files to help with upgrading to the latest Jakarta EE and GlassFish versions

They contain files dropped in newer Jakarta EE versions

* EE8 variant contains classes compatible with `javax.` prefix. They can be safely added to an application that expects javax packages
* EE9 variant contains classes compatible with `jakarta.` prefix

## How to release a new version

1. Update versions in pom files to `VERSION`: `mvn versions:set -DnewVersion=VERSION`
2. Create a tag named VERSION-tag
3. Push the new tag
4. In Github, create a release named `VERSION`from this tag
5. Upload EE8 and EE9 artifacts to the release
