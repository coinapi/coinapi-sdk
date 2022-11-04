#
# OnChain API
#  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Vid

.PARAMETER Id
Pool address.
.PARAMETER CreatedAtTimestamp
Creation time.
.PARAMETER Token0
Reference to token0 as stored in pool contract.
.PARAMETER Token1
Reference to token1 as stored in pool contract.
.PARAMETER FeeTier
No description available.
.PARAMETER Liquidity
No description available.
.PARAMETER SqrtPrice
No description available.
.PARAMETER FeeGrowthGlobal0x128
No description available.
.PARAMETER FeeGrowthGlobal1x128
No description available.
.PARAMETER Token0Price
Token0 per token1.
.PARAMETER Token1Price
Token1 per token0.
.PARAMETER Tick
No description available.
.PARAMETER ObservationIndex
No description available.
.PARAMETER VolumeToken0
All time token0 swapped.
.PARAMETER VolumeToken1
All time token1 swapped.
.PARAMETER VolumeUsd
All time USD swapped.
.PARAMETER UntrackedVolumeUsd
All time USD swapped, unfiltered for unreliable USD pools.
.PARAMETER FeesUsd
Fees in USD.
.PARAMETER TxCount
No description available.
.PARAMETER CollectedFeesToken0
All time fees collected token0.
.PARAMETER CollectedFeesToken1
All time fees collected token1.
.PARAMETER CollectedFeesUsd
All time fees collected derived USD.
.PARAMETER TotalValueLockedToken0
Total token 0 across all ticks.
.PARAMETER TotalValueLockedToken1

.PARAMETER TotalValueLockedEth
Total token 1 across all ticks.
.PARAMETER TotalValueLockedUsd
Total value locked USD.
.PARAMETER TotalValueLockedUsdUntracked
Total value locked derived ETH.
.PARAMETER LiquidityProviderCount
Liquidity providers count, used to detect new exchanges.
.PARAMETER EvaluatedAsk
No description available.
.OUTPUTS

UniswapV3PoolV3DTO<PSCustomObject>
#>

function Initialize-UniswapV3PoolV3DTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${EntryTime},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${RecvTime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${BlockNumber},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${CreatedAtTimestamp},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token0},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token1},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FeeTier},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Liquidity},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${SqrtPrice},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FeeGrowthGlobal0x128},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${FeeGrowthGlobal1x128},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token0Price},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token1Price},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Tick},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${ObservationIndex},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken0},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeToken1},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeUsd},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${UntrackedVolumeUsd},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeesUsd},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TxCount},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CollectedFeesToken0},
        [Parameter(Position = 24, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CollectedFeesToken1},
        [Parameter(Position = 25, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CollectedFeesUsd},
        [Parameter(Position = 26, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedToken0},
        [Parameter(Position = 27, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedToken1},
        [Parameter(Position = 28, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedEth},
        [Parameter(Position = 29, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedUsd},
        [Parameter(Position = 30, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedUsdUntracked},
        [Parameter(Position = 31, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${LiquidityProviderCount},
        [Parameter(Position = 32, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${EvaluatedAsk}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3PoolV3DTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "created_at_timestamp" = ${CreatedAtTimestamp}
            "token_0" = ${Token0}
            "token_1" = ${Token1}
            "fee_tier" = ${FeeTier}
            "liquidity" = ${Liquidity}
            "sqrt_price" = ${SqrtPrice}
            "fee_growth_global_0x128" = ${FeeGrowthGlobal0x128}
            "fee_growth_global_1x128" = ${FeeGrowthGlobal1x128}
            "token_0_price" = ${Token0Price}
            "token_1_price" = ${Token1Price}
            "tick" = ${Tick}
            "observation_index" = ${ObservationIndex}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "collected_fees_token_0" = ${CollectedFeesToken0}
            "collected_fees_token_1" = ${CollectedFeesToken1}
            "collected_fees_usd" = ${CollectedFeesUsd}
            "total_value_locked_token_0" = ${TotalValueLockedToken0}
            "total_value_locked_token_1" = ${TotalValueLockedToken1}
            "total_value_locked_eth" = ${TotalValueLockedEth}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "total_value_locked_usd_untracked" = ${TotalValueLockedUsdUntracked}
            "liquidity_provider_count" = ${LiquidityProviderCount}
            "evaluated_ask" = ${EvaluatedAsk}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3PoolV3DTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3PoolV3DTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3PoolV3DTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3PoolV3DTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3PoolV3DTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3PoolV3DTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "vid", "id", "created_at_timestamp", "token_0", "token_1", "fee_tier", "liquidity", "sqrt_price", "fee_growth_global_0x128", "fee_growth_global_1x128", "token_0_price", "token_1_price", "tick", "observation_index", "volume_token_0", "volume_token_1", "volume_usd", "untracked_volume_usd", "fees_usd", "tx_count", "collected_fees_token_0", "collected_fees_token_1", "collected_fees_usd", "total_value_locked_token_0", "total_value_locked_token_1", "total_value_locked_eth", "total_value_locked_usd", "total_value_locked_usd_untracked", "liquidity_provider_count", "evaluated_ask")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entry_time"))) { #optional property not found
            $EntryTime = $null
        } else {
            $EntryTime = $JsonParameters.PSobject.Properties["entry_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recv_time"))) { #optional property not found
            $RecvTime = $null
        } else {
            $RecvTime = $JsonParameters.PSobject.Properties["recv_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "block_number"))) { #optional property not found
            $BlockNumber = $null
        } else {
            $BlockNumber = $JsonParameters.PSobject.Properties["block_number"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at_timestamp"))) { #optional property not found
            $CreatedAtTimestamp = $null
        } else {
            $CreatedAtTimestamp = $JsonParameters.PSobject.Properties["created_at_timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_0"))) { #optional property not found
            $Token0 = $null
        } else {
            $Token0 = $JsonParameters.PSobject.Properties["token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_1"))) { #optional property not found
            $Token1 = $null
        } else {
            $Token1 = $JsonParameters.PSobject.Properties["token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_tier"))) { #optional property not found
            $FeeTier = $null
        } else {
            $FeeTier = $JsonParameters.PSobject.Properties["fee_tier"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity"))) { #optional property not found
            $Liquidity = $null
        } else {
            $Liquidity = $JsonParameters.PSobject.Properties["liquidity"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "sqrt_price"))) { #optional property not found
            $SqrtPrice = $null
        } else {
            $SqrtPrice = $JsonParameters.PSobject.Properties["sqrt_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_global_0x128"))) { #optional property not found
            $FeeGrowthGlobal0x128 = $null
        } else {
            $FeeGrowthGlobal0x128 = $JsonParameters.PSobject.Properties["fee_growth_global_0x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_global_1x128"))) { #optional property not found
            $FeeGrowthGlobal1x128 = $null
        } else {
            $FeeGrowthGlobal1x128 = $JsonParameters.PSobject.Properties["fee_growth_global_1x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_0_price"))) { #optional property not found
            $Token0Price = $null
        } else {
            $Token0Price = $JsonParameters.PSobject.Properties["token_0_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_1_price"))) { #optional property not found
            $Token1Price = $null
        } else {
            $Token1Price = $JsonParameters.PSobject.Properties["token_1_price"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tick"))) { #optional property not found
            $Tick = $null
        } else {
            $Tick = $JsonParameters.PSobject.Properties["tick"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "observation_index"))) { #optional property not found
            $ObservationIndex = $null
        } else {
            $ObservationIndex = $JsonParameters.PSobject.Properties["observation_index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_token_0"))) { #optional property not found
            $VolumeToken0 = $null
        } else {
            $VolumeToken0 = $JsonParameters.PSobject.Properties["volume_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_token_1"))) { #optional property not found
            $VolumeToken1 = $null
        } else {
            $VolumeToken1 = $JsonParameters.PSobject.Properties["volume_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume_usd"))) { #optional property not found
            $VolumeUsd = $null
        } else {
            $VolumeUsd = $JsonParameters.PSobject.Properties["volume_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "untracked_volume_usd"))) { #optional property not found
            $UntrackedVolumeUsd = $null
        } else {
            $UntrackedVolumeUsd = $JsonParameters.PSobject.Properties["untracked_volume_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fees_usd"))) { #optional property not found
            $FeesUsd = $null
        } else {
            $FeesUsd = $JsonParameters.PSobject.Properties["fees_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_count"))) { #optional property not found
            $TxCount = $null
        } else {
            $TxCount = $JsonParameters.PSobject.Properties["tx_count"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "collected_fees_token_0"))) { #optional property not found
            $CollectedFeesToken0 = $null
        } else {
            $CollectedFeesToken0 = $JsonParameters.PSobject.Properties["collected_fees_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "collected_fees_token_1"))) { #optional property not found
            $CollectedFeesToken1 = $null
        } else {
            $CollectedFeesToken1 = $JsonParameters.PSobject.Properties["collected_fees_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "collected_fees_usd"))) { #optional property not found
            $CollectedFeesUsd = $null
        } else {
            $CollectedFeesUsd = $JsonParameters.PSobject.Properties["collected_fees_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked_token_0"))) { #optional property not found
            $TotalValueLockedToken0 = $null
        } else {
            $TotalValueLockedToken0 = $JsonParameters.PSobject.Properties["total_value_locked_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked_token_1"))) { #optional property not found
            $TotalValueLockedToken1 = $null
        } else {
            $TotalValueLockedToken1 = $JsonParameters.PSobject.Properties["total_value_locked_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked_eth"))) { #optional property not found
            $TotalValueLockedEth = $null
        } else {
            $TotalValueLockedEth = $JsonParameters.PSobject.Properties["total_value_locked_eth"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked_usd"))) { #optional property not found
            $TotalValueLockedUsd = $null
        } else {
            $TotalValueLockedUsd = $JsonParameters.PSobject.Properties["total_value_locked_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked_usd_untracked"))) { #optional property not found
            $TotalValueLockedUsdUntracked = $null
        } else {
            $TotalValueLockedUsdUntracked = $JsonParameters.PSobject.Properties["total_value_locked_usd_untracked"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity_provider_count"))) { #optional property not found
            $LiquidityProviderCount = $null
        } else {
            $LiquidityProviderCount = $JsonParameters.PSobject.Properties["liquidity_provider_count"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "evaluated_ask"))) { #optional property not found
            $EvaluatedAsk = $null
        } else {
            $EvaluatedAsk = $JsonParameters.PSobject.Properties["evaluated_ask"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "created_at_timestamp" = ${CreatedAtTimestamp}
            "token_0" = ${Token0}
            "token_1" = ${Token1}
            "fee_tier" = ${FeeTier}
            "liquidity" = ${Liquidity}
            "sqrt_price" = ${SqrtPrice}
            "fee_growth_global_0x128" = ${FeeGrowthGlobal0x128}
            "fee_growth_global_1x128" = ${FeeGrowthGlobal1x128}
            "token_0_price" = ${Token0Price}
            "token_1_price" = ${Token1Price}
            "tick" = ${Tick}
            "observation_index" = ${ObservationIndex}
            "volume_token_0" = ${VolumeToken0}
            "volume_token_1" = ${VolumeToken1}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "collected_fees_token_0" = ${CollectedFeesToken0}
            "collected_fees_token_1" = ${CollectedFeesToken1}
            "collected_fees_usd" = ${CollectedFeesUsd}
            "total_value_locked_token_0" = ${TotalValueLockedToken0}
            "total_value_locked_token_1" = ${TotalValueLockedToken1}
            "total_value_locked_eth" = ${TotalValueLockedEth}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "total_value_locked_usd_untracked" = ${TotalValueLockedUsdUntracked}
            "liquidity_provider_count" = ${LiquidityProviderCount}
            "evaluated_ask" = ${EvaluatedAsk}
        }

        return $PSO
    }

}

