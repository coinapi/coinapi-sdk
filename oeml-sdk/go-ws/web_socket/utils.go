// Copyright (c) 2021. Marvin Friedrich Lars Hansen. All Rights Reserved. Contact: marvin.hansen@gmail.com

package web_socket

import "log"

func logError(err error) {
	if err != nil {
		log.Println(err)
	}
}

func printRawMsg(message []byte) {
	msg := string(message)
	log.Println("raw message: ")
	log.Println(msg)
}
