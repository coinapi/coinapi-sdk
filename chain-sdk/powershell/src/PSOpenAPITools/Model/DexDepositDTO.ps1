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

Deposit of an user.

.PARAMETER EntryTime
No description available.
.PARAMETER RecvTime
No description available.
.PARAMETER BlockNumber
Number of block in which entity was recorded.
.PARAMETER Id
Identifier, format: <transaction hash>-<token id>.
.PARAMETER User
User address.
.PARAMETER TokenAddress
Token address.
.PARAMETER Amount
Amount of deposit.
.PARAMETER BatchId
Identifier (numerical).
.PARAMETER CreateEpoch
Create epoch.
.PARAMETER TxHash
Transaction hash.
.PARAMETER Vid

.OUTPUTS

DexDepositDTO<PSCustomObject>
#>

function Initialize-DexDepositDTO {
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
        ${User},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TokenAddress},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Amount},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BatchId},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreateEpoch},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${TxHash},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DexDepositDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "user" = ${User}
            "token_address" = ${TokenAddress}
            "amount" = ${Amount}
            "batch_id" = ${BatchId}
            "create_epoch" = ${CreateEpoch}
            "tx_hash" = ${TxHash}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DexDepositDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to DexDepositDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DexDepositDTO<PSCustomObject>
#>
function ConvertFrom-JsonToDexDepositDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DexDepositDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DexDepositDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "user", "token_address", "amount", "batch_id", "create_epoch", "tx_hash", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "token_address"))) { #optional property not found
            $TokenAddress = $null
        } else {
            $TokenAddress = $JsonParameters.PSobject.Properties["token_address"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "amount"))) { #optional property not found
            $Amount = $null
        } else {
            $Amount = $JsonParameters.PSobject.Properties["amount"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "batch_id"))) { #optional property not found
            $BatchId = $null
        } else {
            $BatchId = $JsonParameters.PSobject.Properties["batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "create_epoch"))) { #optional property not found
            $CreateEpoch = $null
        } else {
            $CreateEpoch = $JsonParameters.PSobject.Properties["create_epoch"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "tx_hash"))) { #optional property not found
            $TxHash = $null
        } else {
            $TxHash = $JsonParameters.PSobject.Properties["tx_hash"].value
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
            "user" = ${User}
            "token_address" = ${TokenAddress}
            "amount" = ${Amount}
            "batch_id" = ${BatchId}
            "create_epoch" = ${CreateEpoch}
            "tx_hash" = ${TxHash}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

