package org.template.leadscoring

import org.apache.predictionio.controller.EngineFactory
import org.apache.predictionio.controller.Engine

case class Query(
  landingPageId: String,
  referrerId: String,
  browser: String
) extends Serializable

case class PredictedResult(
  score: Double
) extends Serializable

object LeadScoringEngine extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("randomforest" -> classOf[RFAlgorithm]),
      classOf[Serving])
  }
}
