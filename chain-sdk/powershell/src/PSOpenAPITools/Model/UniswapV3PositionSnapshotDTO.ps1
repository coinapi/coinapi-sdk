#
# On Chain Dapps - REST API
#  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
NFT token identifier, format: (NFT token id)#(block number).
.PARAMETER Owner
Owner of the NFT.
.PARAMETER Pool
Pool the position is within.
.PARAMETER Position
Position of which the snap was taken of.
.PARAMETER Timestamp
Timestamp of block in which the snap was created.
.PARAMETER Liquidity
Total position liquidity.
.PARAMETER DepositedToken0
Amount of token 0 ever deposited to position.
.PARAMETER DepositedToken1
Amount of token 1 ever deposited to position.
.PARAMETER WithdrawnToken0
Amount of token 0 ever withdrawn from position (without fees).
.PARAMETER WithdrawnToken1
Amount of token 1 ever withdrawn from position (without fees).
.PARAMETER CollectedFeesToken0
All time collected fees in token0.
.PARAMETER CollectedFeesToken1
All time collected fees in token1.
.PARAMETER Transaction
Transaction in which the snapshot was initialized.
.PARAMETER FeeGrowthInside0LastX128
Variable needed for fee computation.
.PARAMETER FeeGrowthInside1LastX128
Variable needed for fee computation.
.PARAMETER Vid

.OUTPUTS

UniswapV3PositionSnapshotDTO<PSCustomObject>
#>

function Initialize-UniswapV3PositionSnapshotDTO {
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
        [String]
        ${Id},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Owner},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Pool},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Position},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Timestamp},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Liquidity},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DepositedToken0},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DepositedToken1},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${WithdrawnToken0},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${WithdrawnToken1},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CollectedFeesToken0},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CollectedFeesToken1},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Transaction},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthInside0LastX128},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeeGrowthInside1LastX128},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3PositionSnapshotDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "owner" = ${Owner}
            "pool" = ${Pool}
            "position" = ${Position}
            "timestamp" = ${Timestamp}
            "liquidity" = ${Liquidity}
            "deposited_token_0" = ${DepositedToken0}
            "deposited_token_1" = ${DepositedToken1}
            "withdrawn_token_0" = ${WithdrawnToken0}
            "withdrawn_token_1" = ${WithdrawnToken1}
            "collected_fees_token_0" = ${CollectedFeesToken0}
            "collected_fees_token_1" = ${CollectedFeesToken1}
            "transaction" = ${Transaction}
            "fee_growth_inside_0_last_x128" = ${FeeGrowthInside0LastX128}
            "fee_growth_inside_1_last_x128" = ${FeeGrowthInside1LastX128}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3PositionSnapshotDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3PositionSnapshotDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3PositionSnapshotDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3PositionSnapshotDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3PositionSnapshotDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3PositionSnapshotDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "owner", "pool", "position", "timestamp", "liquidity", "deposited_token_0", "deposited_token_1", "withdrawn_token_0", "withdrawn_token_1", "collected_fees_token_0", "collected_fees_token_1", "transaction", "fee_growth_inside_0_last_x128", "fee_growth_inside_1_last_x128", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner"))) { #optional property not found
            $Owner = $null
        } else {
            $Owner = $JsonParameters.PSobject.Properties["owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool"))) { #optional property not found
            $Pool = $null
        } else {
            $Pool = $JsonParameters.PSobject.Properties["pool"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "position"))) { #optional property not found
            $Position = $null
        } else {
            $Position = $JsonParameters.PSobject.Properties["position"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "timestamp"))) { #optional property not found
            $Timestamp = $null
        } else {
            $Timestamp = $JsonParameters.PSobject.Properties["timestamp"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "liquidity"))) { #optional property not found
            $Liquidity = $null
        } else {
            $Liquidity = $JsonParameters.PSobject.Properties["liquidity"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deposited_token_0"))) { #optional property not found
            $DepositedToken0 = $null
        } else {
            $DepositedToken0 = $JsonParameters.PSobject.Properties["deposited_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deposited_token_1"))) { #optional property not found
            $DepositedToken1 = $null
        } else {
            $DepositedToken1 = $JsonParameters.PSobject.Properties["deposited_token_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "withdrawn_token_0"))) { #optional property not found
            $WithdrawnToken0 = $null
        } else {
            $WithdrawnToken0 = $JsonParameters.PSobject.Properties["withdrawn_token_0"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "withdrawn_token_1"))) { #optional property not found
            $WithdrawnToken1 = $null
        } else {
            $WithdrawnToken1 = $JsonParameters.PSobject.Properties["withdrawn_token_1"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "transaction"))) { #optional property not found
            $Transaction = $null
        } else {
            $Transaction = $JsonParameters.PSobject.Properties["transaction"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_inside_0_last_x128"))) { #optional property not found
            $FeeGrowthInside0LastX128 = $null
        } else {
            $FeeGrowthInside0LastX128 = $JsonParameters.PSobject.Properties["fee_growth_inside_0_last_x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fee_growth_inside_1_last_x128"))) { #optional property not found
            $FeeGrowthInside1LastX128 = $null
        } else {
            $FeeGrowthInside1LastX128 = $JsonParameters.PSobject.Properties["fee_growth_inside_1_last_x128"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "vid"))) { #optional property not found
            $Vid = $null
        } else {
            $Vid = $JsonParameters.PSobject.Properties["vid"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "owner" = ${Owner}
            "pool" = ${Pool}
            "position" = ${Position}
            "timestamp" = ${Timestamp}
            "liquidity" = ${Liquidity}
            "deposited_token_0" = ${DepositedToken0}
            "deposited_token_1" = ${DepositedToken1}
            "withdrawn_token_0" = ${WithdrawnToken0}
            "withdrawn_token_1" = ${WithdrawnToken1}
            "collected_fees_token_0" = ${CollectedFeesToken0}
            "collected_fees_token_1" = ${CollectedFeesToken1}
            "transaction" = ${Transaction}
            "fee_growth_inside_0_last_x128" = ${FeeGrowthInside0LastX128}
            "fee_growth_inside_1_last_x128" = ${FeeGrowthInside1LastX128}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

