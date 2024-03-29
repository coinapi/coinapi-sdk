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

Stores aggregated information for a specific token across all pairs that token is included in.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Vid

.PARAMETER Id
Token address.
.PARAMETER Symbol
Token symbol.
.PARAMETER Name
Token name.
.PARAMETER Decimals
Token decimals.
.PARAMETER TotalSupply
No description available.
.PARAMETER Volume
Volume in token units.
.PARAMETER VolumeUsd
Volume in derived USD.
.PARAMETER UntrackedVolumeUsd
Volume in USD even on pools with less reliable USD values.
.PARAMETER FeesUsd
Fees in USD.
.PARAMETER TxCount
No description available.
.PARAMETER PoolCount
No description available.
.PARAMETER TotalValueLocked
Liquidity across all pools in token units.
.PARAMETER TotalValueLockedUsd
Liquidity across all pools in derived USD.
.PARAMETER TotalValueLockedUsdUntracked
TVL derived in USD untracked.
.PARAMETER DerivedEth
Derived price in ETH.
.PARAMETER WhitelistPools
Pools token is in that are white listed for USD pricing.
.PARAMETER TokenSymbol
No description available.
.OUTPUTS

UniswapV3TokenDTO<PSCustomObject>
#>

function Initialize-UniswapV3TokenDTO {
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
        [String]
        ${Symbol},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Decimals},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TotalSupply},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Volume},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeUsd},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${UntrackedVolumeUsd},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeesUsd},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TxCount},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${PoolCount},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLocked},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedUsd},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedUsdUntracked},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DerivedEth},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${WhitelistPools},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TokenSymbol}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UniswapV3TokenDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "symbol" = ${Symbol}
            "name" = ${Name}
            "decimals" = ${Decimals}
            "total_supply" = ${TotalSupply}
            "volume" = ${Volume}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "pool_count" = ${PoolCount}
            "total_value_locked" = ${TotalValueLocked}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "total_value_locked_usd_untracked" = ${TotalValueLockedUsdUntracked}
            "derived_eth" = ${DerivedEth}
            "whitelist_pools" = ${WhitelistPools}
            "token_symbol" = ${TokenSymbol}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UniswapV3TokenDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to UniswapV3TokenDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UniswapV3TokenDTO<PSCustomObject>
#>
function ConvertFrom-JsonToUniswapV3TokenDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UniswapV3TokenDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UniswapV3TokenDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "vid", "id", "symbol", "name", "decimals", "total_supply", "volume", "volume_usd", "untracked_volume_usd", "fees_usd", "tx_count", "pool_count", "total_value_locked", "total_value_locked_usd", "total_value_locked_usd_untracked", "derived_eth", "whitelist_pools", "token_symbol")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "symbol"))) { #optional property not found
            $Symbol = $null
        } else {
            $Symbol = $JsonParameters.PSobject.Properties["symbol"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "decimals"))) { #optional property not found
            $Decimals = $null
        } else {
            $Decimals = $JsonParameters.PSobject.Properties["decimals"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_supply"))) { #optional property not found
            $TotalSupply = $null
        } else {
            $TotalSupply = $JsonParameters.PSobject.Properties["total_supply"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "volume"))) { #optional property not found
            $Volume = $null
        } else {
            $Volume = $JsonParameters.PSobject.Properties["volume"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pool_count"))) { #optional property not found
            $PoolCount = $null
        } else {
            $PoolCount = $JsonParameters.PSobject.Properties["pool_count"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total_value_locked"))) { #optional property not found
            $TotalValueLocked = $null
        } else {
            $TotalValueLocked = $JsonParameters.PSobject.Properties["total_value_locked"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "derived_eth"))) { #optional property not found
            $DerivedEth = $null
        } else {
            $DerivedEth = $JsonParameters.PSobject.Properties["derived_eth"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "whitelist_pools"))) { #optional property not found
            $WhitelistPools = $null
        } else {
            $WhitelistPools = $JsonParameters.PSobject.Properties["whitelist_pools"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_symbol"))) { #optional property not found
            $TokenSymbol = $null
        } else {
            $TokenSymbol = $JsonParameters.PSobject.Properties["token_symbol"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "symbol" = ${Symbol}
            "name" = ${Name}
            "decimals" = ${Decimals}
            "total_supply" = ${TotalSupply}
            "volume" = ${Volume}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "fees_usd" = ${FeesUsd}
            "tx_count" = ${TxCount}
            "pool_count" = ${PoolCount}
            "total_value_locked" = ${TotalValueLocked}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "total_value_locked_usd_untracked" = ${TotalValueLockedUsdUntracked}
            "derived_eth" = ${DerivedEth}
            "whitelist_pools" = ${WhitelistPools}
            "token_symbol" = ${TokenSymbol}
        }

        return $PSO
    }

}

