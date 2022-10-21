note
    description: "API tests for POSITIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class POSITIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_chains_chain_id_dapps_uniswapv3_positions_historical_get
            -- 
            --
            -- 
        local
            l_chain_id: STRING_32
            l_start_block: INTEGER_64
            l_end_block: INTEGER_64
            l_start_date: DATE_TIME
            l_end_date: DATE_TIME
            l_pool_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_chain_id

            -- api.chains_chain_id_dapps_uniswapv3_positions_historical_get(l_chain_id, l_start_block, l_end_block, l_start_date, l_end_date, l_pool_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POSITIONS_API
            -- Create an object instance of `POSITIONS_API'.
        once
            create { POSITIONS_API } Result
        end

end
