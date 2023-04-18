Another small client-side mod for the QuiltMC modloader which forces the client to render the main hand as the option is set (Options -> Skin Customization -> Main Hand), regardless of whether the server supports it or not (i.e., servers such as Hypixel, which don't natively support the usage of main arm being left). If the server doesn't support such a feature, then the render will be client side, meaning nobody else other than you will see this change. Supported versions are 1.16.5 to 1.18.2.


To self-compile: `gradlew build` - the .jar mod file will be created in `build/libs/force-main-hand-v1.jar`
