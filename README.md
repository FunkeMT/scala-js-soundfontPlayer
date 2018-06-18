# Scala.js façade for soundfont-player

[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.8.svg)](https://www.scala-js.org)

[soundfont-player](https://github.com/danigb/soundfont-player) is a JavaScript library which loads soundfonts to play MIDI sounds using the WebAudio API.

See also [soundfont-player](https://github.com/danigb/soundfont-player) for additional information.
    
## Inclusions
    
The following supporting scala.js façades are included, **Soundfont.intrument**, **Soundfont.nameToUrl** and **SamplePlayer**.    
   
   
## References

1)  [soundfont-player](https://github.com/danigb/soundfont-player)

2)  [WebvrScala](https://github.com/workingDog/WebvrScala) [deployment ref]
   

## Dependencies
      
Using Scala.js-0.6.10, Scala-2.11.8, sbt-0.13.11


## Usage   
   
To publish this library locally, type:
   
     sbt publishLocally
   
This will put ` "com.github.funkemt" %%% "scala-js-soundfontplayer" % "0.1-SNAPSHOT" ` into your local repository.

Then in your [Scala.js](https://www.scala-js.org/) app build.sbt file, simply include:
    
     libraryDependencies += "com.github.funkemt" %%% "scala-js-soundfontplayer" % "0.1-SNAPSHOT"
     
Don't forget to add the JavaScript library itself.
soundfont-player is available at [WebJars](https://www.webjars.org)

     libraryDependencies += "org.webjars.npm" % "soundfont-player" % "0.10.6"


## Status

Experimental
