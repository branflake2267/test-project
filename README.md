###Generating the seleton-config theme
1. Open and add all the values to the properties in the `skeleton-config.theme` file.
* Windows: `.\themebuilder\examples\skeleton-config\skeleton-config.theme`
* Mac: `./themebuilder/examples/skeleton-config/skeleton-config.theme`
2. Generate the theme.
* Windows: `.\themebuilder\bin\themer.bat .\themebuilder\examples\skeleton-config\skeleton-config.theme`
* Mac: `./themebuilder/bin/themer.sh ./themebuilder/examples/skeleton-config/skeleton-config.theme`
3. Find the generated theme jar in the same directory the themer command was run.

###Generating the quickstart-config theme
1. Optional modify the `quick-start.theme` values.
* Windows: `.\themebuilder\examples\quick-start\quick-start.theme`
* Mac: `./themebuilder/examples/quick-start/quick-start.theme`
2. Generate the theme.
* Windows: `.\themebuilder\bin\themer.bat .\themebuilder\examples\quick-start\quick-start.theme`
* Mac: `./themebuilder/bin/themer.sh ./themebuilder/examples/quick-start/quick-start.theme`
3. Find the generated theme `quickstart.jar` in the same directory the themer command was run.

###Generating the maven-jar theme
1. Optional: modify the theme in the directory `maven-jar` named `themeDetails.theme`.
2. Change to the `maven-jar` directory.
* Windows: `cd .\themebuilder\examples\maven-jar`
* Mac: `cd ./themebuilder/examples/maven-jar`
3. Generate the theme by running `mvn-install`.
4. Find the generated theme in the target directory named `sample-theme-1.0.0-SNAPSHOT.jar`.

###Generating the maven-source theme
1. Optional: modify the theme in the directory `maven-source` named `themeDetails.theme`.
2. Change to the `maven-source`.
* Windows: `cd .\themebuilder\examples\maven-source`
* Mac: `cd ./themebuilder/examples/maven-source`
3. Generate the theme by running `mvn-install`.
4. Find the generated theme in the target directory named `sample-theme-1.0.0-SNAPSHOT.jar`.
