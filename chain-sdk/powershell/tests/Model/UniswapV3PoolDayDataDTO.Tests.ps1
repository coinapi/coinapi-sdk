#
# OnChain API
#  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

Describe -tag 'PSOpenAPITools' -name 'UniswapV3PoolDayDataDTO' {
    Context 'UniswapV3PoolDayDataDTO' {
        It 'Initialize-UniswapV3PoolDayDataDTO' {
            # a simple test to create an object
            #$NewObject = Initialize-UniswapV3PoolDayDataDTO -EntryTime "TEST_VALUE" -RecvTime "TEST_VALUE" -BlockNumber "TEST_VALUE" -Id "TEST_VALUE" -Date "TEST_VALUE" -Pool "TEST_VALUE" -Liquidity "TEST_VALUE" -SqrtPrice "TEST_VALUE" -Token0Price "TEST_VALUE" -Token1Price "TEST_VALUE" -Tick "TEST_VALUE" -FeeGrowthGlobal0x128 "TEST_VALUE" -FeeGrowthGlobal1x128 "TEST_VALUE" -TvlUsd "TEST_VALUE" -VolumeToken0 "TEST_VALUE" -VolumeToken1 "TEST_VALUE" -VolumeUsd "TEST_VALUE" -FeesUsd "TEST_VALUE" -TxCount "TEST_VALUE" -Open "TEST_VALUE" -High "TEST_VALUE" -Low "TEST_VALUE" -Close "TEST_VALUE" -Vid "TEST_VALUE"
            #$NewObject | Should -BeOfType UniswapV3PoolDayDataDTO
            #$NewObject.property | Should -Be 0
        }
    }
}
