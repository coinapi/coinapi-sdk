/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class CurveVotingAppDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * App address.
    */
    'id'?: string | null;
    /**
    * 
    */
    'address'?: string | null;
    /**
    * 
    */
    'codename'?: string | null;
    /**
    * Minimum balance needed to create a proposal.
    */
    'minimumBalance'?: string | null;
    /**
    * Percentage of positive votes in total possible votes for a proposal to be accepted.
    */
    'minimumQuorum'?: string | null;
    /**
    * Minimum time needed to pass between user\'s previous proposal and a user creating a new proposal.
    */
    'minimumTime'?: string | null;
    /**
    * Percentage of positive votes needed for a proposal to be accepted.
    */
    'requiredSupport'?: string | null;
    /**
    * Seconds that a proposal will be open for vote (unless enough votes have been cast to make an early decision).
    */
    'voteTime'?: string | null;
    /**
    * Number of proposals created with this app.
    */
    'proposalCount'?: string | null;
    /**
    * Number of votes received by all the proposals created with this app.
    */
    'voteCount'?: string | null;
    /**
    * Address of the token used for voting.
    */
    'token'?: string | null;
    /**
    * 
    */
    'vid'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "entryTime",
            "baseName": "entry_time",
            "type": "Date"
        },
        {
            "name": "recvTime",
            "baseName": "recv_time",
            "type": "Date"
        },
        {
            "name": "blockNumber",
            "baseName": "block_number",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "address",
            "baseName": "address",
            "type": "string"
        },
        {
            "name": "codename",
            "baseName": "codename",
            "type": "string"
        },
        {
            "name": "minimumBalance",
            "baseName": "minimum_balance",
            "type": "string"
        },
        {
            "name": "minimumQuorum",
            "baseName": "minimum_quorum",
            "type": "string"
        },
        {
            "name": "minimumTime",
            "baseName": "minimum_time",
            "type": "string"
        },
        {
            "name": "requiredSupport",
            "baseName": "required_support",
            "type": "string"
        },
        {
            "name": "voteTime",
            "baseName": "vote_time",
            "type": "string"
        },
        {
            "name": "proposalCount",
            "baseName": "proposal_count",
            "type": "string"
        },
        {
            "name": "voteCount",
            "baseName": "vote_count",
            "type": "string"
        },
        {
            "name": "token",
            "baseName": "token",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CurveVotingAppDTO.attributeTypeMap;
    }
}

