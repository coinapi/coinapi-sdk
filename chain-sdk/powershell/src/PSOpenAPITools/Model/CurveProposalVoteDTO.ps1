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
Number of block in which entity was recorded.
.PARAMETER Id

.PARAMETER Proposal

.PARAMETER Supports

.PARAMETER Stake

.PARAMETER Voter

.PARAMETER Created

.PARAMETER CreatedAtBlock

.PARAMETER CreatedAtTransaction

.PARAMETER Vid

.OUTPUTS

CurveProposalVoteDTO<PSCustomObject>
#>

function Initialize-CurveProposalVoteDTO {
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
        ${Proposal},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Supports},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Stake},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Voter},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Created},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreatedAtBlock},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreatedAtTransaction},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Vid}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CurveProposalVoteDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "entry_time" = ${EntryTime}
            "recv_time" = ${RecvTime}
            "block_number" = ${BlockNumber}
            "id" = ${Id}
            "proposal" = ${Proposal}
            "supports" = ${Supports}
            "stake" = ${Stake}
            "voter" = ${Voter}
            "created" = ${Created}
            "created_at_block" = ${CreatedAtBlock}
            "created_at_transaction" = ${CreatedAtTransaction}
            "vid" = ${Vid}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CurveProposalVoteDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to CurveProposalVoteDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CurveProposalVoteDTO<PSCustomObject>
#>
function ConvertFrom-JsonToCurveProposalVoteDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CurveProposalVoteDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CurveProposalVoteDTO
        $AllProperties = ("entry_time", "recv_time", "block_number", "id", "proposal", "supports", "stake", "voter", "created", "created_at_block", "created_at_transaction", "vid")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "proposal"))) { #optional property not found
            $Proposal = $null
        } else {
            $Proposal = $JsonParameters.PSobject.Properties["proposal"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "supports"))) { #optional property not found
            $Supports = $null
        } else {
            $Supports = $JsonParameters.PSobject.Properties["supports"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "stake"))) { #optional property not found
            $Stake = $null
        } else {
            $Stake = $JsonParameters.PSobject.Properties["stake"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "voter"))) { #optional property not found
            $Voter = $null
        } else {
            $Voter = $JsonParameters.PSobject.Properties["voter"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created"))) { #optional property not found
            $Created = $null
        } else {
            $Created = $JsonParameters.PSobject.Properties["created"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at_block"))) { #optional property not found
            $CreatedAtBlock = $null
        } else {
            $CreatedAtBlock = $JsonParameters.PSobject.Properties["created_at_block"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at_transaction"))) { #optional property not found
            $CreatedAtTransaction = $null
        } else {
            $CreatedAtTransaction = $JsonParameters.PSobject.Properties["created_at_transaction"].value
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
            "proposal" = ${Proposal}
            "supports" = ${Supports}
            "stake" = ${Stake}
            "voter" = ${Voter}
            "created" = ${Created}
            "created_at_block" = ${CreatedAtBlock}
            "created_at_transaction" = ${CreatedAtTransaction}
            "vid" = ${Vid}
        }

        return $PSO
    }

}

