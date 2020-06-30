/**
 * OEML - REST API
 * Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.core

import java.io.File
import java.net.URLEncoder
import java.time.OffsetDateTime

import scala.util.Try

sealed trait ApiReturnWithHeaders {
  def headers: Map[String, String]

  def header(name: String): Option[String] = headers.get(name)

  def getStringHeader(name: String): Option[String] = header(name)

  // workaround: return date time header in string instead of datetime object
  def getDateTimeHeader(name: String): Option[String] = header(name)

  def getIntHeader(name: String): Option[Int] = castedHeader(name, java.lang.Integer.parseInt)

  def getLongHeader(name: String): Option[Long] = castedHeader(name, java.lang.Long.parseLong)

  def getFloatHeader(name: String): Option[Float] = castedHeader(name, java.lang.Float.parseFloat)

  def getDoubleHeader(name: String): Option[Double] = castedHeader(name, java.lang.Double.parseDouble)

  def getBooleanHeader(name: String): Option[Boolean] = castedHeader(name, java.lang.Boolean.parseBoolean)

  def getOffsetDateTimeHeader(name: String): Option[OffsetDateTime] = castedHeader(name, java.time.OffsetDateTime.parse)

  private def castedHeader[U](name: String, conversion: String => U): Option[U] = {
    Try {
      header(name).map(conversion)
    }.get
  }
}

sealed case class ApiResponse[T](code: Int, content: T, headers: Map[String, String] = Map.empty)
  extends ApiReturnWithHeaders

sealed case class ApiError[T](code: Int, message: String, responseContent: Option[T], cause: Throwable = null, headers: Map[String, String] = Map.empty)
  extends Throwable(s"($code) $message.${responseContent.map(s => s" Content : $s").getOrElse("")}", cause)
    with ApiReturnWithHeaders

sealed case class ApiMethod(value: String)

object ApiMethods {
  val CONNECT = ApiMethod("CONNECT")
  val DELETE = ApiMethod("DELETE")
  val GET = ApiMethod("GET")
  val HEAD = ApiMethod("HEAD")
  val OPTIONS = ApiMethod("OPTIONS")
  val PATCH = ApiMethod("PATCH")
  val POST = ApiMethod("POST")
  val PUT = ApiMethod("PUT")
  val TRACE = ApiMethod("TRACE")
}

/**
 * This trait needs to be added to any model defined by the api.
 */
trait ApiModel

/**
 * Single trait defining a credential that can be transformed to a paramName / paramValue tupple
 */
sealed trait Credentials {
  def asQueryParam: Option[(String, String)] = None
}

sealed case class BasicCredentials(user: String, password: String) extends Credentials

sealed case class BearerToken(token: String) extends Credentials

sealed case class ApiKeyCredentials(key: ApiKeyValue, keyName: String, location: ApiKeyLocation) extends Credentials {
  override def asQueryParam: Option[(String, String)] = location match {
    case ApiKeyLocations.QUERY => Some((keyName, key.value))
    case _ => None
  }
}

sealed case class ApiKeyValue(value: String)

sealed trait ApiKeyLocation

object ApiKeyLocations {

  case object QUERY extends ApiKeyLocation

  case object HEADER extends ApiKeyLocation

  case object COOKIE extends ApiKeyLocation

}


/**
 * Case class used to unapply numeric values only in pattern matching
 *
 * @param value the string representation of the numeric value
 */
sealed case class NumericValue(value: String) {
  override def toString: String = value
}

object NumericValue {
  def unapply(n: Any): Option[NumericValue] = n match {
    case (_: Int | _: Long | _: Float | _: Double | _: Boolean | _: Byte) => Some(NumericValue(String.valueOf(n)))
    case _ => None
  }
}

/**
 * Used for params being arrays
 */
sealed case class ArrayValues(values: Seq[Any], format: CollectionFormat = CollectionFormats.CSV)

object ArrayValues {
  def apply(values: Option[Seq[Any]], format: CollectionFormat): ArrayValues =
    ArrayValues(values.getOrElse(Seq.empty), format)

  def apply(values: Option[Seq[Any]]): ArrayValues = ArrayValues(values, CollectionFormats.CSV)
}


/**
 * Defines how arrays should be rendered in query strings.
 */
sealed trait CollectionFormat

trait MergedArrayFormat extends CollectionFormat {
  def separator: String
}

object CollectionFormats {

  case object CSV extends MergedArrayFormat {
    override val separator = ","
  }

  case object TSV extends MergedArrayFormat {
    override val separator = "\t"
  }

  case object SSV extends MergedArrayFormat {
    override val separator = " "
  }

  case object PIPES extends MergedArrayFormat {
    override val separator = "|"
  }

  case object MULTI extends CollectionFormat

}

object ParametersMap {

  /**
   * Pimp parameters maps (Map[String, Any]) in order to transform them in a sequence of String -> Any tupples,
   * with valid url-encoding, arrays handling, files preservation, ...
   */
  implicit class ParametersMapImprovements(val m: Map[String, Any]) {

    def asFormattedParamsList: List[(String, Any)] = m.toList.flatMap(formattedParams)

    def asFormattedParams: Map[String, Any] = m.flatMap(formattedParams)

    private def urlEncode(v: Any) = URLEncoder.encode(String.valueOf(v), "utf-8").replaceAll("\\+", "%20")

    private def formattedParams(tuple: (String, Any)): Seq[(String, Any)] = formattedParams(tuple._1, tuple._2)

    private def formattedParams(name: String, value: Any): Seq[(String, Any)] = value match {
      case arr: ArrayValues =>
        arr.format match {
          case CollectionFormats.MULTI => arr.values.flatMap(formattedParams(name, _))
          case format: MergedArrayFormat => Seq((name, arr.values.mkString(format.separator)))
        }
      case None => Seq.empty
      case Some(opt) => formattedParams(name, opt)
      case s: Seq[Any] => formattedParams(name, ArrayValues(s))
      case v: String => Seq((name, urlEncode(v)))
      case NumericValue(v) => Seq((name, urlEncode(v)))
      case f: File => Seq((name, f))
      case m: ApiModel => Seq((name, m))
    }
  }

}
