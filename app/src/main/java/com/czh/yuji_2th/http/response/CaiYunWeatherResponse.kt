package com.czh.yuji_2th.http.response

data class CaiYunWeatherResponse(
    val api_status: String,
    val api_version: String,
    val lang: String,
    val location: List<Double>,
    val result: Result,
    val server_time: Int,
    val status: String,
    val timezone: String,
    val tzshift: Int,
    val unit: String
)

data class Result(
    val alert: Alert,
    val daily: Daily,
    val forecast_keypoint: String,
    val hourly: Hourly,
    val minutely: Minutely,
    val primary: Int,
    val realtime: Realtime
)

data class Alert(
    val content: List<Any>,
    val status: String
)

data class Daily(
    val air_quality: AirQuality,
    val astro: List<Astro>,
    val cloudrate: List<Cloudrate>,
    val dswrf: List<Dswrf>,
    val humidity: List<Humidity>,
    val life_index: LifeIndex,
    val precipitation: List<Precipitation>,
    val pressure: List<Pressure>,
    val skycon: List<Skycon>,
    val skycon_08h_20h: List<Skycon08h20h>,
    val skycon_20h_32h: List<Skycon20h32h>,
    val status: String,
    val temperature: List<Temperature>,
    val visibility: List<Visibility>,
    val wind: List<Wind>
)

data class Hourly(
    val air_quality: AirQualityX,
    val cloudrate: List<CloudrateX>,
    val description: String,
    val dswrf: List<DswrfX>,
    val humidity: List<HumidityX>,
    val precipitation: List<PrecipitationX>,
    val pressure: List<PressureX>,
    val skycon: List<SkyconX>,
    val status: String,
    val temperature: List<TemperatureX>,
    val visibility: List<VisibilityX>,
    val wind: List<WindX>
)

data class Minutely(
    val datasource: String,
    val description: String,
    val precipitation: List<Double>,
    val precipitation_2h: List<Double>,
    val probability: List<Double>,
    val status: String
)

data class Realtime(
    val air_quality: AirQualityXX,
    val apparent_temperature: Double,
    val cloudrate: Double,
    val dswrf: Double,
    val humidity: Double,
    val life_index: LifeIndexX,
    val precipitation: PrecipitationXX,
    val pressure: Double,
    val skycon: String,
    val status: String,
    val temperature: Double,
    val visibility: Double,
    val wind: WindXX
)

data class AirQuality(
    val aqi: List<Aqi>,
    val pm25: List<Pm25>
)

data class Astro(
    val date: String,
    val sunrise: Sunrise,
    val sunset: Sunset
)

data class Cloudrate(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Dswrf(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Humidity(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class LifeIndex(
    val carWashing: List<CarWashing>,
    val coldRisk: List<ColdRisk>,
    val comfort: List<Comfort>,
    val dressing: List<Dressing>,
    val ultraviolet: List<Ultraviolet>
)

data class Precipitation(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Pressure(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Skycon(
    val date: String,
    val value: String
)

data class Skycon08h20h(
    val date: String,
    val value: String
)

data class Skycon20h32h(
    val date: String,
    val value: String
)

data class Temperature(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Visibility(
    val avg: Double,
    val date: String,
    val max: Double,
    val min: Double
)

data class Wind(
    val avg: AvgX,
    val date: String,
    val max: MaxX,
    val min: MinX
)

data class Aqi(
    val avg: Avg,
    val date: String,
    val max: Max,
    val min: Min
)

data class Pm25(
    val avg: Double,
    val date: String,
    val max: Int,
    val min: Int
)

data class Avg(
    val chn: Double,
    val usa: Double
)

data class Max(
    val chn: Int,
    val usa: Int
)

data class Min(
    val chn: Int,
    val usa: Int
)

data class Sunrise(
    val time: String
)

data class Sunset(
    val time: String
)

data class CarWashing(
    val date: String,
    val desc: String,
    val index: String
)

data class ColdRisk(
    val date: String,
    val desc: String,
    val index: String
)

data class Comfort(
    val date: String,
    val desc: String,
    val index: String
)

data class Dressing(
    val date: String,
    val desc: String,
    val index: String
)

data class Ultraviolet(
    val date: String,
    val desc: String,
    val index: String
)

data class AvgX(
    val direction: Double,
    val speed: Double
)

data class MaxX(
    val direction: Double,
    val speed: Double
)

data class MinX(
    val direction: Double,
    val speed: Double
)

data class AirQualityX(
    val aqi: List<AqiX>,
    val pm25: List<Pm25X>
)

data class CloudrateX(
    val datetime: String,
    val value: Double
)

data class DswrfX(
    val datetime: String,
    val value: Double
)

data class HumidityX(
    val datetime: String,
    val value: Double
)

data class PrecipitationX(
    val datetime: String,
    val value: Double
)

data class PressureX(
    val datetime: String,
    val value: Double
)

data class SkyconX(
    val datetime: String,
    val value: String
)

data class TemperatureX(
    val datetime: String,
    val value: Double
)

data class VisibilityX(
    val datetime: String,
    val value: Double
)

data class WindX(
    val datetime: String,
    val direction: Double,
    val speed: Double
)

data class AqiX(
    val datetime: String,
    val value: Value
)

data class Pm25X(
    val datetime: String,
    val value: Int
)

data class Value(
    val chn: Int,
    val usa: Int
)

data class AirQualityXX(
    val aqi: AqiXX,
    val co: Double,
    val description: Description,
    val no2: Double,
    val o3: Double,
    val pm10: Double,
    val pm25: Double,
    val so2: Double
)

data class LifeIndexX(
    val comfort: ComfortX,
    val ultraviolet: UltravioletX
)

data class PrecipitationXX(
    val local: Local,
    val nearest: Nearest
)

data class WindXX(
    val direction: Double,
    val speed: Double
)

data class AqiXX(
    val chn: Double,
    val usa: Double
)

data class Description(
    val chn: String,
    val usa: String
)

data class ComfortX(
    val desc: String,
    val index: Int
)

data class UltravioletX(
    val desc: String,
    val index: Double
)

data class Local(
    val datasource: String,
    val intensity: Double,
    val status: String
)

data class Nearest(
    val distance: Double,
    val intensity: Double,
    val status: String
)