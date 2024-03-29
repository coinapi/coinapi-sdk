/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface CurveVotingAppDTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * App address.
     */
    id?: string | null;
    /**
     * 
     */
    address?: string | null;
    /**
     * 
     */
    codename?: string | null;
    /**
     * Minimum balance needed to create a proposal.
     */
    minimum_balance?: string | null;
    /**
     * Percentage of positive votes in total possible votes for a proposal to be accepted.
     */
    minimum_quorum?: string | null;
    /**
     * Minimum time needed to pass between user\'s previous proposal and a user creating a new proposal.
     */
    minimum_time?: string | null;
    /**
     * Percentage of positive votes needed for a proposal to be accepted.
     */
    required_support?: string | null;
    /**
     * Seconds that a proposal will be open for vote (unless enough votes have been cast to make an early decision).
     */
    vote_time?: string | null;
    /**
     * Number of proposals created with this app.
     */
    proposal_count?: string | null;
    /**
     * Number of votes received by all the proposals created with this app.
     */
    vote_count?: string | null;
    /**
     * Address of the token used for voting.
     */
    token?: string | null;
    /**
     * 
     */
    vid?: number;
}

