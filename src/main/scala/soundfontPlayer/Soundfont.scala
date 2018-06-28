package soundfontPlayer

import org.scalajs.dom.raw.AudioContext

import scala.scalajs.js

@js.native
object Soundfont extends js.Object {
  /**
    * Creates a new Soundfont instrument.
    *
    *
    * @param ac 'Object with Dynamic' Actually, the type is 'AudioContext.
    *           But Safari works only with 'webkitAudioContext'.
    *           However, to apply this argument for all browsers you can pass:
    *           js.Dynamic.newInstance(js.Dynamic.global.AudioContext || js.Dynamic.global.webkitAudioContext)()
    * @param name String The Instrument name
    * @param options js.Object Optional arguments
    * @return js.Promise[SamplePlayer] JavaScript Promise with type 'SamplePlayer'
    */
  def instrument(ac: Object with Dynamic, name: String, options: js.Object = null): js.Promise[SamplePlayer] = js.native

  def nameToUrl(name: String, sf: String, format: String): String = js.native
}