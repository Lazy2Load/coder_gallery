package com.coder.gallery.lld.parking_lot.dtos;

import com.coder.gallery.lld.parking_lot.models.Ticket;

enum Status{
    ERROR,
    SUCCESS
}
public class GetTicketDTO {
    Status status;
    Ticket ticket;
}
