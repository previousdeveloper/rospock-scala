package lib


trait IGameLogicStrategyResolver {

  @throws(classOf[Exception])
  def resolve(strategyType: StrategyType): IGameLogicStrategy
}
