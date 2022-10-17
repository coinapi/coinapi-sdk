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

No description available.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
No description available.
.PARAMETER Vid
No description available.
.PARAMETER Id
No description available.
.PARAMETER Date
No description available.
.PARAMETER Token
No description available.
.PARAMETER Volume
No description available.
.PARAMETER VolumeUsd
No description available.
.PARAMETER UntrackedVolumeUsd
No description available.
.PARAMETER TotalValueLocked
No description available.
.PARAMETER TotalValueLockedUsd
No description available.
.PARAMETER PriceUsd
No description available.
.PARAMETER FeesUsd
No description available.
.PARAMETER Open
No description available.
.PARAMETER High
No description available.
.PARAMETER Low
No description available.
.PARAMETER Close
No description available.
.OUTPUTS

TokenV3DayDataDTO<PSCustomObject>
#>

function Initialize-TokenV3DayDataDTO {
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
        [System.Nullable[Int32]]
        ${Date},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Token},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Volume},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${VolumeUsd},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${UntrackedVolumeUsd},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLocked},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TotalValueLockedUsd},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PriceUsd},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FeesUsd},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Open},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${High},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Low},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Close}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => TokenV3DayDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "date" = ${Date}
            "token" = ${Token}
            "volume" = ${Volume}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "total_value_locked" = ${TotalValueLocked}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "price_usd" = ${PriceUsd}
            "fees_usd" = ${FeesUsd}
            "open" = ${Open}
            "high" = ${High}
            "low" = ${Low}
            "close" = ${Close}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TokenV3DayDataDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to TokenV3DayDataDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TokenV3DayDataDTO<PSCustomObject>
#>
function ConvertFrom-JsonToTokenV3DayDataDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => TokenV3DayDataDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TokenV3DayDataDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "vid", "id", "date", "token", "volume", "volume_usd", "untracked_volume_usd", "total_value_locked", "total_value_locked_usd", "price_usd", "fees_usd", "open", "high", "low", "close")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "date"))) { #optional property not found
            $Date = $null
        } else {
            $Date = $JsonParameters.PSobject.Properties["date"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token"))) { #optional property not found
            $Token = $null
        } else {
            $Token = $JsonParameters.PSobject.Properties["token"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "price_usd"))) { #optional property not found
            $PriceUsd = $null
        } else {
            $PriceUsd = $JsonParameters.PSobject.Properties["price_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fees_usd"))) { #optional property not found
            $FeesUsd = $null
        } else {
            $FeesUsd = $JsonParameters.PSobject.Properties["fees_usd"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "open"))) { #optional property not found
            $Open = $null
        } else {
            $Open = $JsonParameters.PSobject.Properties["open"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "high"))) { #optional property not found
            $High = $null
        } else {
            $High = $JsonParameters.PSobject.Properties["high"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "low"))) { #optional property not found
            $Low = $null
        } else {
            $Low = $JsonParameters.PSobject.Properties["low"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "close"))) { #optional property not found
            $Close = $null
        } else {
            $Close = $JsonParameters.PSobject.Properties["close"].value
        }

        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "vid" = ${Vid}
            "id" = ${Id}
            "date" = ${Date}
            "token" = ${Token}
            "volume" = ${Volume}
            "volume_usd" = ${VolumeUsd}
            "untracked_volume_usd" = ${UntrackedVolumeUsd}
            "total_value_locked" = ${TotalValueLocked}
            "total_value_locked_usd" = ${TotalValueLockedUsd}
            "price_usd" = ${PriceUsd}
            "fees_usd" = ${FeesUsd}
            "open" = ${Open}
            "high" = ${High}
            "low" = ${Low}
            "close" = ${Close}
        }

        return $PSO
    }

}
